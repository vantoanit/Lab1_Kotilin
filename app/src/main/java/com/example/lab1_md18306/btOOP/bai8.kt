package com.example.lab1_md18306.btOOP

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    val danhsachPM = mutableListOf<TheMuon>()
    var pm1 = TheMuon("Nguyen Van C",22,"PL1234","HH11",15,20,"ML111")

    danhsachPM.add(TheMuon("Tran Van A", 33,"PL000","OP00",10,20,"LM9999"))
    danhsachPM.add(TheMuon("Tran Van B", 36,"PL123","CP00",20,30,"LM0000"))


    println(pm1.getThongTinPM())

    println("------------------------")
    println("Menu quan ly PM")
    println("1. Them phiếu mượn")
    println("2. Hien thi danh sach PM")
    println("3. Xoa PM")
    println("4. Cap nhat thong tin PM")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Them phiếu mượn mới")
                    print("Nhap ho ten sinh vien: ")
                    val hoten = readLine()!!
                    print("Nhap tuoi sinh vien: ")
                    val tuoi = readLine()!!.toIntOrNull()
                    print("Nhap lop sinh vien: ")
                    val lop = readLine()
                    print("Nhap ma phiếu mượn: ")
                    val maPM = readLine()!!
                    print("Nhap ngay mượn (so nguyen duong): ")
                    val ngayMuon = readLine()!!.toInt()
                    print("Nhap han tra (so nguyen duong): ")
                    val hanTra = readLine()!!.toInt()
                    print("Nhap so hieu sach: ")
                    val soHieuSach = readLine()!!

                    val theMuon = TheMuon(hoten, tuoi, lop, maPM, ngayMuon, hanTra, soHieuSach)
                    danhsachPM.add(theMuon)
                    println("Them phiếu mượn thanh cong!")

                }


                2 -> {
                    println("Danh sach phiếu mượn")
                    println("--------------------------")
                    if (danhsachPM.isEmpty()) {
                        println("Khong co giao vien nao trong danh sach")
                    } else {
                        danhsachPM.forEach { gv ->
                            println(gv.getThongTinPM())
                        }
                    }
                }

                3 -> {
                    println("Xoa phiếu mượn")
                    println("--------------------------")
                    println("Nhap mspm can xoa: ")

                    val maPM = readLine()!!
                    val iterator = danhsachPM.iterator()
                    var found = false
                    while (iterator.hasNext()) {
                        val theMuon = iterator.next()
                        if (theMuon.maPM == maPM) {
                            iterator.remove()
                            found = true
                            println("Xoa phiếu mượn thanh cong!")
                        }
                    }
                    if (!found) {
                        println("Khong tim thay phiếu mượn voi ma phiếu mượn $maPM")
                    }


                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Nhap mpm can cap nhat: ")
                    val maPM = readLine()!!
                    val theMuon = danhsachPM.find { it.maPM == maPM }
                    if (theMuon != null) {
                        print("Nhap ho ten sinh vien moi: ")
                        theMuon.hoten = readLine()!!
                        print("Nhap tuoi sinh vien moi: ")
                        theMuon.tuoi = readLine()!!.toIntOrNull()
                        print("Nhap lop sinh vien moi: ")
                        theMuon.lop = readLine()
                        print("Nhap ngay mượn moi (so nguyen duong): ")
                        theMuon.ngayMuon = readLine()!!.toInt()
                        print("Nhap han tra moi (so nguyen duong): ")
                        theMuon.hanTra = readLine()!!.toInt()
                        print("Nhap so hieu sach moi: ")
                        theMuon.soHieuSach = readLine()!!
                        println("Cap nhat thong tin phiếu mượn thanh cong!")
                    } else {
                        println("Khong tim thay phiếu mượn voi ma phiếu mượn $maPM")
                    }

                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)


}