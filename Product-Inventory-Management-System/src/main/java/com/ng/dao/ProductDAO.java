package com.ng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ng.model.Product;

@Repository
public class ProductDAO {

	private static final String ADD_STOCK = "UPDATE PRODUCTS SET QUANTITY=QUANTITY+? WHERE name=?";
	private static final String GET_STOCK = "UPDATE PRODUCTS SET QUANTITY= QUANTITY-? WHERE name=?";
	private static final String CHECK_AVAILABILITY = "SELECT QUANTITY FROM PRODUCTS WHERE name =?";
	private static final String GET_ALL_PRODUCTS = "SELECT,PRICE,QUANTITY FROM PRODUCTS";
    private static final String GET_INVENTORY = "SELECT SUM(QUANTITY*PRICE) FROM PRODUCTS";
	@Autowired
	private DataSource ds;

	public int addStock(int amount, String name) throws Exception {

		try (Connection con = ds.getConnection(); PreparedStatement psmt = con.prepareStatement(ADD_STOCK);) {

			psmt.setInt(1, amount);
			psmt.setString(2, name);
			int count = psmt.executeUpdate();
			return count;

		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}

	}

	public int reduceStock(int requiredQuantity, String name) throws Exception {

		try (Connection con = ds.getConnection(); PreparedStatement psmt = con.prepareStatement(GET_STOCK)) {
			psmt.setInt(1, requiredQuantity);
			psmt.setString(2, name);
			return psmt.executeUpdate();
		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}
	}
	public int checkAvailability(String name) throws Exception {

		try (Connection con = ds.getConnection(); PreparedStatement psmt = con.prepareStatement(CHECK_AVAILABILITY)) {
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			} else {
				throw new Exception("NO RECORDS FOUND");
			}
		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}

	}

	public List<Product> getStockList() throws Exception{
		
		try (Connection con = ds.getConnection(); PreparedStatement psmt = con.prepareStatement(GET_ALL_PRODUCTS);
				ResultSet rs = psmt.executeQuery();) {
		
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				Product p = new Product(rs.getLong(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				list.add(p);
			}
			return list;
			
			
		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}
		
	}

	public Double calculateInventory() throws Exception{
		
		try (Connection con = ds.getConnection(); PreparedStatement psmt = con.prepareStatement(GET_ALL_PRODUCTS);
				ResultSet rs = psmt.executeQuery();) {
		
			    return rs.getDouble(1);
			
		} catch (SQLException se) {
			throw se;
		} catch (Exception e) {
			throw e;
		}
		
	}

}
