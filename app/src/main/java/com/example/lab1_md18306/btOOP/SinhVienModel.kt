package com.example.lab1_md18306.btOOP

open class SinhVienModel(var hoten: String, var tuoi: Int?, var lop: String?) {
    open fun getThongTinPM(): String {
        return "Họ tên: $hoten, Tuổi: $tuoi, Lớp: $lop"
    }
}
