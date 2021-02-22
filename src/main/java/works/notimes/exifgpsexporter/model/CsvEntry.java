/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package works.notimes.exifgpsexporter.model;

import java.util.Date;

/**
 *
 * @author seclokadmin
 */
public class CsvEntry {
    public String Name;
    public String GPSVersionID;
    public String GPSLatitudeRef;
    public String GPSLatitude;
    public String GPSLongitudeRef;
    public String GPSLongitude;
    public String GPSAltitudeRef;
    public String GPSAltitude;
    public String GPSTimeStamp;
    public String GPSSatellites;
    public String GPSStatus;
    public String GPSImgDirectionRef;
    public String GPSImgDirection;
    public String GPSMapDatum;
    public String GPSDateStamp;

    public CsvEntry(String Name, String GPSVersionID, String GPSLatitudeRef, String GPSLatitude, String GPSLongitudeRef, String GPSLongitude, String GPSAltitudeRef, String GPSAltitude, String GPSTimeStamp, String GPSSatellites, String GPSStatus, String GPSImgDirectionRef, String GPSImgDirection, String GPSMapDatum, String GPSDateStamp) {
        this.Name = Name;
        this.GPSVersionID = GPSVersionID;
        this.GPSLatitudeRef = GPSLatitudeRef;
        this.GPSLatitude = GPSLatitude;
        this.GPSLongitudeRef = GPSLongitudeRef;
        this.GPSLongitude = GPSLongitude;
        this.GPSAltitudeRef = GPSAltitudeRef;
        this.GPSAltitude = GPSAltitude;
        this.GPSTimeStamp = GPSTimeStamp;
        this.GPSSatellites = GPSSatellites;
        this.GPSStatus = GPSStatus;
        this.GPSImgDirectionRef = GPSImgDirectionRef;
        this.GPSImgDirection = GPSImgDirection;
        this.GPSMapDatum = GPSMapDatum;
        this.GPSDateStamp = GPSDateStamp;
    }

    public CsvEntry() {
        this.Name = "";
        this.GPSVersionID = "";
        this.GPSLatitudeRef = "";
        this.GPSLatitude = "";
        this.GPSLongitudeRef = "";
        this.GPSLongitude = "";
        this.GPSAltitudeRef = "";
        this.GPSAltitude = "";
        this.GPSTimeStamp = "";
        this.GPSSatellites = "";
        this.GPSStatus = "";
        this.GPSImgDirectionRef = "";
        this.GPSImgDirection = "";
        this.GPSMapDatum = "";
        this.GPSDateStamp = "";
    }

    @Override
    public String toString() {
        return "\"" + Name + "\";\"" + 
                GPSVersionID + "\";\"" + 
                GPSLatitudeRef + "\";\"" + 
                GPSLatitude + "\";\"" + 
                GPSLongitudeRef + "\";\"" + 
                GPSLongitude + "\";\"" + 
                GPSAltitudeRef + "\";\"" + 
                GPSAltitude + "\";\"" + 
                GPSTimeStamp + "\";\"" + 
                GPSSatellites + "\";\"" + 
                GPSStatus + "\";\"" + 
                GPSImgDirectionRef + "\";\"" + 
                GPSImgDirection + "\";\"" + 
                GPSMapDatum + "\";\"" + 
                GPSDateStamp + "\";";
    }
    
    
}
