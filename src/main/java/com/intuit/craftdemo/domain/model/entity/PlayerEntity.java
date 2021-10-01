package com.intuit.craftdemo.domain.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_players")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "playerID")
    private String playerID;

    @Column(name = "birthYear")
    private String birthYear;

    @Column(name = "birthMonth")
    private String birthMonth;

    @Column(name = "birthDay")
    private String birthDay;

    @Column(name = "nameFirst")
    private String nameFirst;

    @Column(name = "nameLast")
    private String nameLast;

    public PlayerEntity()
    {

    }
    public PlayerEntity(String playerID, String birthYear, String birthMonth, String birthDay, String nameFirst, String nameLast) {
        this.playerID = playerID;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    @Override
    public String toString() {
        return "PlayerEntity{" +
                "playerID='" + playerID + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", birthMonth='" + birthMonth + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                '}';
    }
}
