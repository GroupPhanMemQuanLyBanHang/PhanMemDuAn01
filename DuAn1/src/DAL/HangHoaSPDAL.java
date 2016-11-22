/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author HOANG
 */
public class HangHoaSPDAL {
    
     public static void CauTruyVanThemHangHoaSP(HangHoaSPDTO HH) {
        String SQLThem = "insert into SanPham(MaSanPham,MaLoaiSanPham,TenSanPham,Imei,HanBaoHanh,SoLuong,DonViTinh,GiaBan,GiaNhap,MoTa)"
                + " values("+HH.getMaSanPham()+","+HH.getMaLoaiSanpham()+",N'"+HH.getTenSanPham()+"',N'"+HH.getImail()+"','"+HH.getHanBaoHanh()+"'"
                + ","+HH.getSoLuong()+",N'"+HH.getDonViTinh()+"','"+HH.getGiaBan()+"','"+HH.getGiaNhap()+"',N'"+HH.getMoTa()+"')";
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
     
 public static void CauTruyVanSuaHangHoaSP(HangHoaSPDTO HH) {
        String SQLSua = "update SanPham set  MaLoaiSanPham='"+HH.getMaLoaiSanpham()+"',TenSanPham = N'"+HH.getTenSanPham()+"'"
                + ",Imei = '"+HH.getImail()+"',HanBaoHanh = '"+HH.getHanBaoHanh()+"',SoLuong=N'"+HH.getSoLuong()+"',DonViTinh = N'"+HH.getDonViTinh()+"'"
                + ",GiaBan = '"+HH.getGiaBan()+"',GiaNhap= '"+HH.getGiaNhap()+"',MoTa = N'"+HH.getMoTa()+"' where MaSanPham = " +HH.getMaSanPham();
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }

    public static void CauTruyVanXoaHoaDon(String MaSanPham) {
        String SQlXoa = "delete from SanPham where MaSanPham = "+MaSanPham+"" ;
        ConnectionDB.ExcuteQueryUpdate(SQlXoa);
    }
    
    public static ResultSet CauTruyVanLayThongTinHangHoa() {
        ResultSet rs;
        String SQLSelect = "select * from SanPham";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
      public static ResultSet CauTruyVanLayThongTinLSP() {
        ResultSet rs;
        String SQLSelect = "select * from LoaiSanPham";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
    
    public static ResultSet TimSanPham(String tuKhoa ){
        ResultSet rs;        
        String cauTruyVanSQL = "Select * from SanPham "
                + "where TenSanPham like N'%" + tuKhoa + "%' "
                + "or SoLuong like N'%" + tuKhoa + "%'"
                +"or DonViTinh like N'%"+tuKhoa+"%'";
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
         return rs;        
    }
    
      public static HangHoaSPDTO LayHangHoaTheoHangHoa(String maSP){
        ResultSet rs;
        String cauTruyVanSQL = "Select * from SanPham where MaSanPham = '" + maSP + "'";
        
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        HangHoaSPDTO sp = new HangHoaSPDTO();
        try {
            while(rs.next()){
               sp.setMaSanPham(rs.getInt("MaSanPham"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return sp;
    }
}
