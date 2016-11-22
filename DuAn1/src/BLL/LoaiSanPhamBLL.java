/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiSanPhamDAL;
import DTO.LoaiSanPhamDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOANG
 */
public class LoaiSanPhamBLL {
    public static void DoDuLieuVaoJTableLoáianPham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"mã Loại Sản Phẩm", "Tên Loại Sản Phẩm", "Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[3];
                item[0] = rs.getInt("MaLoaiSanPham");
                item[1] = rs.getString("TenLoaiSanPham");
                item[2] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
     public static boolean kiemTra(LoaiSanPhamDTO LSP){
        boolean ketQua = true;
       if(LSP.getTenLoaiSP().trim().equals("")){
            MainClass.ThongBao("Chưa nhập Tên Loại sản phẩm", "Thông Báo", 1);
            return false;
        }
        return ketQua;
    }
    // Hàm Lấy thông tin dữ liệu trong DAL
    public static void ThemLSP(LoaiSanPhamDTO DH){
        boolean ketQua = kiemTra(DH);
        if(ketQua){
            LoaiSanPhamDAL.CauTruyVanThemLSP(DH);
        }
    }
    public static void SuaLSP(LoaiSanPhamDTO KH){
        boolean ketQua = kiemTra(KH);
        if(ketQua){
            LoaiSanPhamDAL.CauTruyVanSuaLSP(KH);
        }
    }
    public static void XoaLSP(String maCanXoa){
        if(maCanXoa.equals("")){
         
        }else{
             LoaiSanPhamDAL.CauTruyVanXoaLSP(maCanXoa);
        }
    }
     public static ResultSet LayTatCaLSP(){
        ResultSet rs;
        rs = LoaiSanPhamDAL.CauTruyVanLayThongTinLSP();
        return rs;
    }
    // Hàm tìm kiếm
    public static ResultSet LaySanPhamTheoTuKhoa(String tuKhoa){
        ResultSet rs;
        rs = LoaiSanPhamDAL.TimLSP(tuKhoa);
        
        return rs;
    }
}
