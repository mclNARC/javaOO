package moldura;

public class Areas implements Calculadora {

	private float base_de_fora;
    private float altura_de_fora;
    private float base_de_dentro;
    private float altura_de_dentro;
    private float area;

    public Areas(float base_de_fora, float altura_de_fora, float base_de_dentro, float altura_de_dentro) {
        this.base_de_fora = base_de_fora;
        this.altura_de_fora = altura_de_fora;
        this.base_de_dentro = base_de_dentro;
        this.altura_de_dentro = altura_de_dentro;
        
    }

    
    public float getBase_de_fora() {
        return base_de_fora;
    }

    public void setBase_de_fora(float base_de_fora) {
        this.base_de_fora = base_de_fora;
    }

    public float getAltura_de_fora() {
        return altura_de_fora;
    }

    public void setAltura_de_fora(float altura_de_fora) {
        this.altura_de_fora = altura_de_fora;
    }

    public float getBase_de_dentro() {
        return base_de_dentro;
    }

    public void setBase_de_dentro(float base_de_dentro) {
        this.base_de_dentro = base_de_dentro;
    }

    public float getAltura_de_dentro() {
        return altura_de_dentro;
    }

    public void setAltura_de_dentro(float altura_de_dentro) {
        this.altura_de_dentro = altura_de_dentro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public void calcular_area() {
        this.area = (this.base_de_fora * this.altura_de_fora)-(this.base_de_dentro * this.altura_de_dentro);
    }

    @Override
    public String toString() {
        return "Areas{" + "base_de_fora=" + base_de_fora + ", altura_de_fora=" + altura_de_fora + ", base_de_dentro=" + base_de_dentro + ", altura_de_dentro=" + altura_de_dentro + ", area=" + area +"CM²"+ '}';
    }


    
    

    
    
    
    
    
}












