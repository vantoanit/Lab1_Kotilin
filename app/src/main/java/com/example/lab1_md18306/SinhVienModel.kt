package com.example.lab1_md18306

class SinhVienModel(val tenSV: String , var mssv: String, var diemTB: Float) {
    var daototNghiep : Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String , mssv: String , diemTB: Float, daototNghiep : Boolean, tuoi: Int) : this (tenSV, mssv, diemTB){
        this.daototNghiep = daototNghiep
        this.tuoi = tuoi
    }

    fun getThongTin () : String{
        var thongtin : String
        if(daototNghiep != null && tuoi != null){
            thongtin = "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB, da tot nnghiep : $daototNghiep , tuoi: $tuoi"
        }else{
            thongtin = "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB"
        }

        return thongtin

    }

}