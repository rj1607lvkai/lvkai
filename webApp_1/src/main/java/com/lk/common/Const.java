package com.lk.common;

import com.google.common.collect.Sets;

import java.util.Set;

public class Const {
    public static final String CURRENT_USER="currentuser";
    public static final String EMAIL="email";
    public static final String USERNAME="username";
    public interface Role{
        int ROLE_CUSTOMER=0;
        int ROLE_ADMIN=1;
    }
    public enum ProductStatusEnum{
        ON_SALE(1,"在售");

        public int getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        private int code;
        private String value;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }
    }
    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC= Sets.newHashSet("price_desc","price_asc");
    }
    public interface Cart{
       int CHECKED=1;
       int UN_CHECKED=0;
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
    }
}
