package com.astratech._b_diyah_tugas1.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "master_product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 15)
    private Long id;
    @Column(name = "name", length = 150)
    private String name;
    @Column(name = "kelas", length = 10)
    private String kelas;

    public Product() {
    }

    public Product(Long id, String name, String kelas) {
        this.id = id;
        this.name = name;
        this.kelas = kelas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
