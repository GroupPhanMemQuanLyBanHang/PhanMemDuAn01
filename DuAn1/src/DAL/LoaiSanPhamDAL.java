/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiSanPhamDTO;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class LoaiSanPhamDAL {
    public static void CauTruyVanThemLSP(LoaiSanPhamDTO LSP) {
        String SQLThem = "insert into LoaiSanPham(TenLoaiSanPham,MoTa)"
         + "Values(N'"+LSP.getTenLoaiSP()+"',N'"+LSP.getMoTa()+"') ";
                
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }

    public static void CauTruyVanSuaLSP(LoaiSanPhamDTO LSP) {
        String SQLSua = "update LoaiSanPham set TenLoaiSanPham=N'"+LSP.getTenLoaiSP()+"',MoTa=N'"+LSP.getMoTa()+"' where MaLoaiSanPham ="+LSP.getMaLoaiSanPham();
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }

    public static void CauTruyVanXoaLSP(String MaLSP) {
        String SQlXoa = "delete from LoaiSanPham where MaLoaiSanPham = '"+MaLSP+"'" ;
        ConnectionDB.ExcuteQueryUpdate(SQlXoa);
    }
    public static ResultSet CauTruyVanLayThongTinLSP() {
        ResultSet rs;
        String SQLSelect = "select * from LoaiSanPham";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
     public static ResultSet TimLSP(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from LoaiSanPham "
                + "where MaLoaiSanPham like N'%" + tuKhoa + "%' "
                + "or NoTa like N'%" + tuKhoa + "%'";
               rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        
        return rs;        
    }
}
