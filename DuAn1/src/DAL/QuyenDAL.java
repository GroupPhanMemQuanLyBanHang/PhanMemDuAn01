/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.QuyenDTO;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class QuyenDAL {
    public static void CauTruyVanThemQuyen(QuyenDTO Q) {
        String SQLThem = "insert into Quyen(TenQuyen,MoTa)" +"values('"+Q.getTenQuyen()+"','"+Q.getMota()+")' ";            
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
       public static void CauTruyVanSuaQuyen(QuyenDTO Q) {
        String SQLSua = "insert into Quyen(TenQuyen,MoTa)";            
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }
        public static ResultSet CauTruyvan(){
            ResultSet rs;
            String Sql = "select * from Quyen";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
}
