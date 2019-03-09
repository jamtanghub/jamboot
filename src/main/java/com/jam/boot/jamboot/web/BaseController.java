package com.jam.boot.jamboot.web;


import org.springframework.beans.factory.annotation.Value;

public class BaseController {

    @Value("${sys.modal}")
    protected String sysModal;
}
