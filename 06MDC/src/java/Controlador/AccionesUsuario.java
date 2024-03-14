/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.sql.*;

/**
 *
 * @author dayan
 */
public class AccionesUsuario {
    
    public static int resgistrarUsuario(Usuario usu){
        int estatus = 0;
        try{
            Connection con = Conexion.getConection();
            String q = "insert into usuario(nom_usu, password_usu, email_usu) "
                    + "values(?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, usu.getNom_usu());
            ps.setString(2, usu.getPassword_usu());
            ps.setString(3, usu.getEmail_usu());
            
            estatus = ps.executeUpdate();
            System.out.println("Registro Exitoso del Usuario");
            con.close();
            
        }catch(SQLException ed){
            System.out.println("Error: " + ed.getMessage());
            System.out.println("No se pudo registar al resgistrar al usuario");
            
        }
        return estatus;
    }

   //buscar alumno por id
    public static Usuario buscarUsuarioByEmail(String email){
        //necesito crear una instancia del usuario
        Usuario usu = new Usuario();
        try{
            Connection con = Conexion.getConection();
            String q = "select * from usuario where email_usu = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            //tengo que buscar dentro de la tabla
            if(rs.next() && rs.getInt(1) < 0){
                usu = new Usuario();
                //get y set
                usu.setIdUsuario(rs.getInt(1));
                usu.setNom_usu(rs.getString(2));
                usu.setPassword_usu(rs.getString(3));
                usu.setEmail_usu(rs.getString(4));
              
            }
            System.out.println("Se encontro al usuario");
            con.close();
        }catch(SQLException e){
            System.out.println("Error " + e.getMessage());
            System.out.println("No se encontro el usuario");
        }
        return usu;
    }

    public static int registrarUsuario(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static int buscarUsuarioEmail(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Usuario buscarByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
