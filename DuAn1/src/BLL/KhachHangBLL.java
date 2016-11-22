/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangBLL {
        public static void JTableKhachhang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Khách Hàng ","Mã Khách Hàng", "Số Điện Thoại","Địa Chỉ","Số Lượng","Đơn Giá"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[6];
                item[0] = rs.getString("TenKH");
                item[1] = rs.getString("MaKH");
                item[2] = rs.getString("SoDienThoai");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getString("SoLuong");
                item[5] = rs.getString("GiaBan");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
        public static boolean  KiemTra(KhachHangDTO KH){
            boolean KetQua = true;
            if(KH.getMota().equals(KetQua)){
                System.out.println("Pass");
                return  false;
            }
            return KetQua;
        }
        public static void ThemKH(KhachHangDTO Kh) {
         boolean Ketqua = KiemTra(Kh);
         if(Ketqua){
             KhachHangDAL.CauTruyVanThemSP(Kh);
         }
    }
}
