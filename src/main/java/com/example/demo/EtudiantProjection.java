package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Etudiant.class}, name = "p1")
public interface EtudiantProjection {
	public String getNom();
	public String getPrenom();
}
