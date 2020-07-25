package es.prodi.model;

import java.sql.Timestamp;

public class Record {
    //should be between 0 and 5 both included
    private int priority;
    private String title;

    private String text;
    //this is the specific day and time starting of the record.
    private Timestamp startTimestamp;
    // this is the specific day and time ending of the record.
    private Timestamp endTimestamp;
    //how many time have the user worked in this record.
    private float spentTime;

}
