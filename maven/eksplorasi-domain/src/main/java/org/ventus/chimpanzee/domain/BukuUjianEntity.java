package org.ventus.chimpanzee.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="master_buku_ujian")
public class BukuUjianEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_master_buku_ujian")
	@SequenceGenerator(name = "seq_master_buku_ujian",sequenceName="seq_master_buku_ujian", allocationSize=1)
	private Long id;
	
	@Column(name="kode")
	private String kode;
	
	@Column(name="nama")
	private String nama;
	
	private String author;
	
	@Column(name="kode_mata_pelajaran")
	private String kodeMataPelajaran;
	
	@Column(name="waktu_pembuatan")
	@Temporal(TemporalType.TIMESTAMP)
	private Date waktuPembuatan;
        
        private String institusi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKodeMataPelajaran() {
		return kodeMataPelajaran;
	}

	public void setKodeMataPelajaran(String kodeMataPelajaran) {
		this.kodeMataPelajaran = kodeMataPelajaran;
	}

	public Date getWaktuPembuatan() {
		return waktuPembuatan;
	}

	public void setWaktuPembuatan(Date waktuPembuatan) {
		this.waktuPembuatan = waktuPembuatan;
	}

    /**
     * @return the institusi
     */
    public String getInstitusi() {
        return institusi;
    }

    /**
     * @param institusi the institusi to set
     */
    public void setInstitusi(String institusi) {
        this.institusi = institusi;
    }
}
