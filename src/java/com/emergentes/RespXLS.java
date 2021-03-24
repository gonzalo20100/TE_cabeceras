
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespXLS", urlPatterns = {"/RespXLS"})
public class RespXLS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("application/vn.ms-exel");
            response.setHeader("Content-Disposition", "attachment;filename=archivo.xls");
            PrintWriter out = response.getWriter();
        try{
            /* TODO output your page here. You may use following sample code. */
            out.println("Respuesta generada desde Exel");
            out.println("100");
            out.println("200");
            out.print("La suma es:\t");            
            out.print("=SUMA(A2:A3)");
        }finally{
            out.close();
        }
    }
}
