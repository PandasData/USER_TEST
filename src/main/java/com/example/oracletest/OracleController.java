package com.example.oracletest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OracleController {

    private final JdbcTemplate jdbcTemplate;

    public OracleController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/test")
    public String testOracle() {
        try {
            String version = jdbcTemplate.queryForObject(
                    "SELECT BANNER FROM V$VERSION WHERE ROWNUM = 1",
                    String.class
            );
            return "✅ Oracle 连接成功！版本：" + version;
        } catch (Exception e) {
            return "❌ 连接失败：" + e.getMessage();
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/user1/{id}")
        public Map<String, Object> getUser(@PathVariable Long id) {
            return jdbcTemplate.queryForMap(
                    "SELECT * FROM test_user WHERE id = ?",
                    id
            );
    }


}