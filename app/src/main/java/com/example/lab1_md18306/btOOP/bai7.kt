package com.example.lab1_md18306.btOOP

import java.util.Scanner


fun main(){
    val scanner = Scanner(System.`in`)
    val danhSachGV = mutableListOf<CBGV>()
    var gv1 = CBGV("Nguyen Van A", 23, "Ha Noi","PJ889",500f,50f,10f)

    danhSachGV.add(CBGV("Tran Van B",22,"Nam Dinh","PK9000",1000f,200f,10f))
    danhSachGV.add(CBGV("Tran Van C",25,"Ha Noi","PH6753",2000f,400f,10f))


    println(gv1.getThongTin())

    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Them giao vien moi")
                    print("Nhap ho ten: ")
                    val hoten = readLine()!!
                    print("Nhap tuoi: ")
                    val tuoi = readLine()!!.toIntOrNull()
                    print("Nhap que quan: ")
                    val quequan = readLine()
                    print("Nhap ma so giao vien: ")
                    val msgv = readLine()!!
                    print("Nhap luong cung: ")
                    val luongcung = readLine()!!.toFloat()
                    print("Nhap luong thuong: ")
                    val lThuong = readLine()!!.toFloatOrNull()
                    print("Nhap luong phat: ")
                    val lPhat = readLine()!!.toFloatOrNull()

                    val gv = CBGV(hoten, tuoi, quequan, msgv, luongcung, lThuong, lPhat)
                    danhSachGV.add(gv)
                    println("Thêm thành công!")

                }


                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                    if (danhSachGV.isEmpty()) {
                        println("Khong co giao vien nao trong danh sach")
                    } else {
                        danhSachGV.forEach { gv ->
                            println(gv.getThongTin())
                        }
                    }
                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    println("Nhap msgv can xoa: ")
                    val msgv = readLine()!!
                    val iterator = danhSachGV.iterator()
                    var found = false
                    while (iterator.hasNext()) {
                        val gv = iterator.next()
                        if (gv.msgv == msgv) {
                            iterator.remove()
                            found = true
                            println("Xoa giao vien thanh cong!")
                        }
                    }
                    if (!found) {
                        println("Khong tim thay giao vien voi ma so $msgv")
                    }

                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Nhap msgv can cap nhat: ")
                    print("Nhap msgv can cap nhat: ")
                    val msgv = readLine()!!
                    val gv = danhSachGV.find { it.msgv == msgv }
                    if (gv != null) {
                        print("Nhap ho ten moi (bo trong neu khong thay doi): ")
                        val hoten = readLine()
                        if (!hoten.isNullOrBlank()) {
                            gv.hoten = hoten
                        }
                        print("Nhap tuoi moi (bo trong neu khong thay doi): ")
                        val tuoi = readLine()!!.toIntOrNull()
                        if (tuoi != null) {
                            gv.tuoi = tuoi
                        }
                        print("Nhap que quan moi (bo trong neu khong thay doi): ")
                        val quequan = readLine()
                        if (!quequan.isNullOrBlank()) {
                            gv.quequan = quequan
                        }
                        print("Nhap luong cung moi (bo trong neu khong thay doi): ")
                        val luongcung = readLine()!!.toFloatOrNull()
                        if (luongcung != null) {
                            gv.luongcung = luongcung
                        }
                        print("Nhap luong thuong moi (bo trong neu khong thay doi): ")
                        val lThuong = readLine()!!.toFloatOrNull()
                        if (lThuong != null) {
                            gv.lThuong = lThuong
                        }
                        print("Nhap luong phat moi (bo trong neu khong thay doi): ")
                        val lPhat = readLine()!!.toFloatOrNull()
                        if (lPhat != null) {
                            gv.lPhat = lPhat
                        }
                        println("Cap nhat thong tin giao vien thanh cong!")
                    } else {
                        println("Khong tim thay giao vien voi ma so $msgv")
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





class bai7 {




}