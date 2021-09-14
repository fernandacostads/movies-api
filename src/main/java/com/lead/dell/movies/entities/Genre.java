package com.lead.dell.movies.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_GENRE")
public class Genre implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name = "genre_id")
	private long genreId;

	private String name;

	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;

	private boolean active = true;


	public boolean isActive() {
		return active;
	}

	
	public void setActive(boolean active) {
		this.active = active;
	}

	
	public long getGenreId() {
		return genreId;
	}

	
	public void setGenreId(long genreId) {
		this.genreId = genreId;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public Language getLanguage() {
		return language;
	}

	
	public void setLanguage(Language language) {
		this.language = language;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
