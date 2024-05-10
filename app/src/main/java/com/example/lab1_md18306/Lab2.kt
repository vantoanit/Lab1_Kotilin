package com.example.lab1_md18306

import java.util.Scanner

fun main(){
//    val tenSV : String? = "Nguyen Van Toan"
//
//    val mssv = getThongTinSV(tenSV!!)
//    println("MSSV cua $tenSV : $mssv")
    val scanner = Scanner(System.`in`)


    val sv1 : SinhVienModel = SinhVienModel("Nguyen Van Toan", "PH35132", 9.0f)
    val sv2 : SinhVienModel = SinhVienModel("Nguyen Van A", "PH12345", 8.0f)


    sv2.daototNghiep = false
    sv2.tuoi = 20

    val  sv3 = SinhVienModel("Nguyen Van B", "PH7844", 7.8f, true, 21)

//    println(sv1.getThongTin())
//    println(sv2.getThongTin())
//    println(sv3.getThongTin())

    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)

    fun themSinhVien(danhSach: MutableList<SinhVienModel>){
        println("Nhap ten sinh vien:")
        val tenSinhVien = scanner.nextLine()

        println("Nhap ma sinh vien:")
        val maSinhVien = scanner.nextLine()

        println("Nhap diemTB sinh vien:")
        val diemTBSinhVien = scanner.nextLine().toFloat()

        println("Sinh viên đã tốt nghiệp chưa? (true/false):")
        val daTotNghiepInput = scanner.nextLine().trim()
        val daTotNghiep = daTotNghiepInput.toBooleanStrictOrNull() ?: throw IllegalArgumentException("Hãy nhập true hoặc false.")

        println("Nhap tuoi sinh vien:")
        val tuoiSinhVien = scanner.nextLine().toInt()

        scanner.nextLine()

        val sinhVienMoi = SinhVienModel(
            tenSinhVien,
            maSinhVien,
            diemTBSinhVien,
            daTotNghiep,
            tuoiSinhVien
        )
        danhSach.add(sinhVienMoi)
    }

    themSinhVien(listSV)

    // Xoas phan tu cuoi cung trong danh sach
  //  listSV.removeAt(listSV.size -1)

    // sua sinh vien
    val indexUpdateSV = 3
    val sinhVien = listSV[indexUpdateSV]
    sinhVien.tuoi = 16
    sinhVien.diemTB = 5.0f

    println("Bai 4: ")
    // cachs 1 : duyet nhanh
    println("Duyet Nhanh")
    for (sv in listSV){
        println(sv.getThongTin())
    }

    println("====================================")
    println("Bai 1:")

    var  a = 0.0
    var b = 0.0
    println("Nhap a: ")
    var s = readLine()
    if(s != null ) a = s.toDouble()
    println("Nhap b: ")
    s = readln()
    if(s!= null) b = s.toDouble()
    if(a == 0.0 && b == 0.0){
        println("Phuong trinh vo so nghiem")
    }else if(a == 0.0 && b!= 0.0){
        println("Phuong trinh vo nghiem")
    }else{
        val x = -b/a
        println("No x:"+x)
    }

    println("================================================")
    println("Bai 2:")

    var month = 0
    println("Nhap thang: ")
    val t: String? = readLine()
    if(t != null) month = t.toInt()
    when(month){
        1,2,3 -> println("Thang "+ month +"thuoc quy 1")
        4,5,6 -> println("Thang "+ month + "thuoc quy 2")
        7,8,9 -> println("Thang "+ month + "thuoc quy 3")
        10,11,12 -> println("Thang "+ month + "thuoc quy 4")
        else -> println("Thang" + month + "ko hop le")
    }

    println("================================================")
    println("Bai 3:")
    var year = 0
    var l: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        l = readLine()
        while (l == null || l.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            l = readLine()
        }
        year = l.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        l = readLine()
        if (l == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")

}



class Lab2 {
}