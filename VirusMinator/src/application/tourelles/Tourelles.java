package application.tourelles;

import application.virus.Virus;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public abstract class Tourelles {

	private IntegerProperty x = new SimpleIntegerProperty();
	private IntegerProperty y = new SimpleIntegerProperty();

	// private int x,y;
	private int portee;
	private double atqSpeed, atq, slow;
	private String nom, ID;

	public Tourelles(double atq, int portee, double atqSpeed, double slow, String nom, int x,
			int y) { /* Constructeur tourelles */

		this.setAtq(atq);
		this.setPortee(portee);
		this.setAtqSpeed(atqSpeed);
		this.setSlow(slow);
		this.nom = nom;
		this.setX(x);
		this.setY(y);

	}

	public abstract void amelioration(); // Ou coder argent necessaire a amelioration

	public String getNom() {

		return nom;

	}

	public String getId() {

		return ID;

	}

	public final int getX() {
		return x.getValue();
	}

	public final IntegerProperty getXProperty() {
		return x;
	}

	public final int getY() {
		return x.getValue();
	}

	public final IntegerProperty getYProperty() {
		return x;
	}

	public final void setX(int n) {
		x.setValue(n);
	}

	public final void setY(int n) {
		x.setValue(n);
	}

	public double getAtq() {
		return atq;
	}

	public void setAtq(double atq2) {
		this.atq = atq2;
	}

	public int getPortee() {
		return portee;
	}

	public void setPortee(int portee) {
		this.portee = portee;
	}

	public double getAtqSpeed() {
		return atqSpeed;
	}

	public void setAtqSpeed(double atqSpeed) {
		this.atqSpeed = atqSpeed;
	}

	public double getSlow() {
		return slow;
	}

	public void setSlow(double slow) {
		this.slow = slow;
	}

	public void Tir() {

		/*
		 * if(this.VirusAPorteeDeTir()) { while(this.VirusAPorteeDeTir().estVivant) {
		 * (this.VirusAPorteeDeTir().pv-this.atq*this.atqSpeed)
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
	}

	public Virus VirusAPorteeDeTir() {

		Virus v = null;
		/*
		 * for(int i=0;i<listeVirusAttente;i++){ if(v instanceof Virus){ if(
		 * (this.getY()-this.portee<= v.getY() && v.getY()<=this.getY()+this.portee) &&
		 * (this.getX()-this.portee<= v.getX() && v.getX()<=this.getX()+this.portee) ){
		 * return v; } } } return null;
		 */
		return v;
	}

}
