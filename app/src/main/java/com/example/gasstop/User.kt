package com.example.gasstop

class User {
    var name:String = ""
    var email:String = ""
    var phoneNumber:String = ""
    var password:String = ""



    constructor(){}
    constructor(name: String, email: String, phoneNumber: String, password: String) {
        this.name = name
        this.email = email
        this.phoneNumber = phoneNumber
        this.password = password
    }
}