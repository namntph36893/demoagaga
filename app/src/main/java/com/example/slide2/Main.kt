package com.example.slide2

fun main(args: Array<String>) {
    // when - switch
    var x = 10
    val y = 200
    when (x) {
        0 -> println("x = 0")
        1 -> println("x = 1")
        (y / 2) -> println("x = y / 2 ")
        in 5..9 -> println("x thuộc khoảng 5 -> 9")
        is Int -> println("x là số nguyên")
        else -> println(" Không xảy ra trường hợp nào")
    }
    // if ~ java
    // && || vs and or
    var a = true
    var b = true
    if (a && b) println("Thoả mãn điều kiện a, b = true")
    if (a || b) println("a hoặc b = true")
    if (a and b) println("and. thoả mãn điều kiện a,b = true")
    if (a or b) println("or. a hoặc b = true")
    // for

    // i++ từ 5 -> 10
    // 5 6 7 8 9 10
    for (i in 5..10) {
        println(i)
    }

    // thay vì i++ , i+=2
    // 5 7 9
    for (i in 5..10 step 2) {
        println("i = $i")
    }

    // 5 6 7 8 9
    for (i in 5 until 10 step 1) println("i =$i")

    // 10 9 8 7 6 5 4 3 2 1
    for (i in 10 downTo 1 step 1) println("i giảm dần $i")

    var items = intArrayOf(5, 3, 2, 8, 4, 8, 4, 3, 2)
    // 5 3 2 8 4 8 4 3 2
    for (i in items) println("Duyệt phần tử $i")

    // duyệt theo vị trí
    for (index in items.indices) println("vị trí $index")

    // duyệt theo giá trị và vị trí
    for ((index, value) in items.withIndex()) {
        println("phần tử thứ $index = $value")
    }
    // while , do while ~ java
    // continue vs break

    for (i in 5..10) {
        label123@ // đánh dấu
        for (i in items) {
            if (i == 2) break@label123
        }
    }
    // null safety - elvis operator - let opreator
    // NullPointerExceptuon - co gang su dung - truy cap 1 doi tuong ma gia tri la null
    var name: String? = null
    var address = "Ha Noi"
    var RoomNo = ""

    // lấy ra giá trị lenght rừ name, nếu ko có thi cho = -1
    var lenght: Int = name?.length ?: -1 // ?: elvis opearator

    // cau lenh chi thuc thi khi name !=null
    name?.let { value -> println(value) }

    //  java - khi ko su dung null safety
    if (name != null) {
        println(name)
    } else println("ko tin duoc name == null")
}