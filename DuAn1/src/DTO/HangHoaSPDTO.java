/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HOANG
 */
public class HangHoaSPDTO {
     private  int IDSanPham;
     private int MaSanPham;
     private int MaLoaiSanpham;
     private  String TenSanPham;
     private String imail;
     private  String HanBaoHanh;
     private int SoLuong;
     private String DonViTinh;
     private String GiaBan;
     private String GiaNhap;
     private  String MoTa;

    public int getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(int IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getMaLoaiSanpham() {
        return MaLoaiSanpham;
    }

    public void setMaLoaiSanpham(int MaLoaiSanpham) {
        this.MaLoaiSanpham = MaLoaiSanpham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getImail() {
        return imail;
    }

    public void setImail(String imail) {
        this.imail = imail;
    }

    public String getHanBaoHanh() {
        return HanBaoHanh;
    }

    public void setHanBaoHanh(String HanBaoHanh) {
        this.HanBaoHanh = HanBaoHanh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(String GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
public HangHoaSPDTO(){
    
}
    public HangHoaSPDTO(int IDSanPham, int MaSanPham, int MaLoaiSanpham, String TenSanPham, String imail, String HanBaoHanh, int SoLuong, String DonViTinh, String GiaBan, String GiaNhap, String MoTa) {
        this.IDSanPham = IDSanPham;
        this.MaSanPham = MaSanPham;
        this.MaLoaiSanpham = MaLoaiSanpham;
        this.TenSanPham = TenSanPham;
        this.imail = imail;
        this.HanBaoHanh = HanBaoHanh;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.MoTa = MoTa;
    }
     
}
