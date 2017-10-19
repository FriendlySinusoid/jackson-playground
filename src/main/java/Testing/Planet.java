package Testing;


import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;


@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "@class")
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class)
public class Planet
{
	private float x, y, z, xv,yv,zv;
	private double mass;
	private String name;

	@JsonCreator
	public Planet(){
		x = 0;
		y = 0;
		z = 0;
		xv = 0;
		zv = 0;
		yv = 0;
		mass = (float) Math.pow(10,7);
		name = "Planet " + System.currentTimeMillis();
	}




	@JsonCreator
	public Planet(@NotNull @JsonProperty(required = true) String name, @JsonProperty(required = true) float mass,@NotNull float... inp){
		this();
		try{
			x = inp[0];
			y = inp[1];
			z = inp[2];
			xv = inp[3];
			yv = inp[4];
			zv = inp[5];
			this.mass = mass;
		}catch(IndexOutOfBoundsException e){
		}finally{

		}

	}
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float getXv() {
		return xv;
	}

	public void setXv(float xv) {
		this.xv = xv;
	}

	public float getYv() {
		return yv;
	}

	public void setYv(float yv) {
		this.yv = yv;
	}

	public float getZv() {
		return zv;
	}

	public void setZv(float zv) {
		this.zv = zv;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
