/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHangDTO;
import java.sql.ResultSet;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangDAL {
      public static void CauTruyVanThemSP(KhachHangDTO KH) {
        String SQLThem = "insert into KhachHang(MaLoaiKH,TenKH,DiaChi,GioiTinh,SoDienThoai,LoaiKH,MoTa)" +
"values('"+KH.getMaLoaiKH()+"','"+KH.getTenKhachHang()+"','"+KH.getDiaChi()+"',"
                + "'"+KH.getGioitinh()+"','"+KH.getSDT()+"','"+KH.getLoaiKH()+"','"+KH.getMota()+"'"
                + ",)";            
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
        public static ResultSet CauTruyvan(){
            ResultSet rs;
            String Sql = "select * from KhachHang,SanPham";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
}
