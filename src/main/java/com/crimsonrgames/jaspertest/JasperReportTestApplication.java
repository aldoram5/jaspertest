/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrgames.jaspertest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author gbmobile
 */
public class JasperReportTestApplication {

    public static void main(String[] args) throws JRException, FileNotFoundException, IOException {
        ArrayList<Test> tests = new ArrayList<>();
        String url = "http://static.higo.mx/content/higo/content/6441/58112297kqbc620x349abc.jpg?rand=0.7080557873989448";
        tests.add(new Test("AAAHHHHHH", "Text test"));
        JasperPrint jasperPrint;
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(tests);
        Map params = new HashMap();
        ArrayList<Report> tests2 = new ArrayList<>();
        Report r = new Report();
        r.setPo("162748");
        r.setClientName("Client Test");
        r.setSummary(tests);
        tests2.add(r);
        ArrayList<QAssortmentRowEntity> rows = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            QAssortmentRowEntity row = new QAssortmentRowEntity();
            row.setProduct("HGK-"+i);
            row.setMaterials("PBS");
            row.setDescription("Long Description " + i + " "+ i);
            rows.add(row);
        }
        r.setAssortmentRows(rows);
        JRBeanCollectionDataSource beanCollectionDataSource2 = new JRBeanCollectionDataSource(tests2);
        Map params2 = new HashMap();
        params.put("headerPath", url);
        jasperPrint = JasperFillManager.fillReport("/Users/aldo/JaspersoftWorkspace/MyReports/CTI-Base.jasper", params, beanCollectionDataSource2);

        try (FileOutputStream outputStream = new FileOutputStream("/Users/aldo/JaspersoftWorkspace/MyReports/CTI-Base.pdf")) {
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
        }
    }

}
