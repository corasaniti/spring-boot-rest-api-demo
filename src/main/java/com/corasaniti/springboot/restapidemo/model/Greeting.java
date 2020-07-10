package com.corasaniti.springboot.restapidemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "grettings")
@EntityListeners(AuditingEntityListener.class)
public class Greeting {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
    
    @Column(name = "content", nullable = false)
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
