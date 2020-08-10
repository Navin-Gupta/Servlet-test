package com.test.servletbased.testcases;

import static org.junit.Assert.assertEquals;
import static com.test.servletbased.testutils.TestUtils.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.test.servletbased.servlets.FirstServ;

public class MyServletTest {
    private FirstServ servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        servlet = new FirstServ();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

    @Test
    public void correctUsernameInRequest() throws ServletException, IOException {
       // request.addParameter("username", "scott");
       // request.addParameter("password", "tiger");

        servlet.doPost(request, response);

        // assertEquals("index.jsp", response.getRedirectedUrl());
        yakshaAssert(currentTest(), response.getRedirectedUrl().equals("index.jsp"), businessTestFile);
        // ... etc
    }
}