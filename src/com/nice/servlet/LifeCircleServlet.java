package com.nice.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LifeCircleServlet")
public class LifeCircleServlet extends HttpServlet {
    public LifeCircleServlet() {
        System.out.println("进入构造方法");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("进入销毁方法");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("进入初始化方法");
    }

    /**
     * 只要接收到客户端的请求，那么就执行这个方法
     * 该方法可以执行很多次，一次请求对应一次Service方法的调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("进入service方法");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入doPost请求方法");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入doGet请求方法");
    }
}
