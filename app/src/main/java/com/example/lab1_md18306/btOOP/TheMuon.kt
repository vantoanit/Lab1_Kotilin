package com.example.lab1_md18306.btOOP

class TheMuon(hoten: String, tuoi: Int?, lop: String?, var maPM: String, var ngayMuon: Int, var hanTra: Int, var soHieuSach: String)
    : SinhVienModel(hoten, tuoi, lop) {

    override fun getThongTinPM(): String {
        return "Sinh viên: ${super.getThongTinPM()} - Mã phiếu mượn: $maPM, Ngày mượn: $ngayMuon, Hạn trả: $hanTra, Số hiệu sách: $soHieuSach"
    }
}
