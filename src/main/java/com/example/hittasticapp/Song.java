/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.hittasticapp;

/**
 *
 * @author nick
 */
public class Song 
{
    
    private long id;
    private String title, artist, genre;
    private int sales, year, chart;
    
    public Song(long idIn, String titleIn, String artistIn, int yearIn, String genreIn, int chartIn)
    {
        id = idIn;
        title = titleIn;
        artist = artistIn;
        sales = 0;
        year = yearIn;
        genre = genreIn;
        chart = chartIn;
    }
    
    public void sell(int amount)
    {
        sales += amount;
    }
    
    public String toString()
    {
        return "ID: " + id + " Title: " + title + " Artist: " + artist + " Sales: " + sales + " Year: " + year + " Genre: " + genre + " Chart: " + chart;
    }  
    
    public long getId()
    {
        return id;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getArtist()
    {
        return artist;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getYear()
    {
        return year;
    }

    public void setSales(int newSales)
    {
        sales = newSales;
    }

    public void setChart(int newChart)
    {
        chart = newChart;
    } 
}
