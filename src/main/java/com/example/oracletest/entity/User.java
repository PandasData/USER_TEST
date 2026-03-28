package com.example.oracletest.entity;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@NullMarked
@Table(name = "TEST_USER")
public class User {

        @Id
        private Long id = 0L;

        @Nullable
        private String name;

        @Nullable
        private Long age;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        @Nullable
        public String getName() {
            return name;
        }

        public void setName(@Nullable String name) {
            this.name = name;
        }

        @Nullable
        public Long getAge() {
            return age;
        }

        public void setAge(@Nullable Long age) {
            this.age = age;
        }


}
