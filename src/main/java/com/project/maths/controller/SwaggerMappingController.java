package com.project.maths.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class SwaggerMappingController
{

    @Value("${app.swagger.url}")
    private String swaggerUrl;


    @RequestMapping("/")
    private String swaggerHomeMapping()
    {
        return "redirect:" + swaggerUrl;
    }

}
