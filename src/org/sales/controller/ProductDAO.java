/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sales.controller;
import java.sql.*;
import org.sales.model.Product;
import org.sales.util.DBConnection;
import java.util.*;
 
/**
 *
 * @author Dell
 */
public class ProductDAO {
    public int insertData(Product ob){
        int count = 0;
        try{
            Connection con = DBConnection.getConnection();
            String sql = "insert into product (name, price, qty, remarks) values (?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ob.getName());
            st.setDouble(2, ob.getPrice());
            st.setInt(3, ob.getQty());
            st.setString(4, ob.getRemarks());
            count = st.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return count;
    }
    public List<Product> fetchData(){
        List <Product> productList = new ArrayList();
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from product";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Product ob = new Product();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setPrice(rs.getDouble("price"));
                ob.setQty(rs.getInt("qty"));
                ob.setRemarks(rs.getString("remarks"));
                productList.add(ob);
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return productList;
    }
    public int updateData(Product ob){
        int count = 0;
        try{
            Connection con = DBConnection.getConnection();
            String sql = "update product set name = ?, price = ?, qty = ?, remarks = ? where id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ob.getName());
            st.setDouble(2, ob.getPrice());
            st.setInt(3, ob.getQty());
            st.setString(4, ob.getRemarks());
            st.setInt(5, ob.getId());
            count = st.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return count;
    }
    public int deleteData(Product ob){
        int count = 0;
        try{
            Connection con = DBConnection.getConnection();
            String sql = "delete from product where id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, ob.getId());
            count = st.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return count;
    }
    public Product fetchData(int id){
        Product ob = new Product();
        try{
            Connection con =  DBConnection.getConnection();
            String sql = "select * from product where id = ? and qty > 0";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setPrice(rs.getDouble("price"));
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return ob;
    }
    public int getQty(int id, Connection con){
        int qty = 0;
        try{
            String sql = "select qty from product where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                qty = rs.getInt("qty");
            }
        }catch(Exception ex){
            System.out.println(ex);
    }
        return qty;
        
}
    public void updateQty(int id, int newQty, Connection con){
        try{
            String sql = "update product set qty = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, newQty);
            pst.setInt(2, id);
            pst.execute();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
