public class Examen4{
    private static Integer nodos;
    private static Intenger dato;

    public static  void  main(String[]args) {
        Arbol nodo =new Arbol();
         nodo.aplicar(1);
        nodo.aplicsr(2);
        nodo.aplicar(3);
       
        
        class Examen4{

            
            ndarbol a,f;
            int dato;
            public ndarbol(int d){
                dato=d;
                a=f=null;
            }
            public synchronized void insertar(int d){
                if(d<dato){
                    if(a==null){
                        a=new ndarbol(d);
                    }
                    else{
                        a.insertar(d);
                    }
                }
                if(d>dato){
                    if(a==null){
                        f=new ndarbol(d);
                    }
                    else{
                        f.insertar(d);
                    }
                }
            }
            public int retornadato(){
                return(dato);
            }
        }
        class arbol{
            private ndarbol raiz;
            private int d;


            public arbol() {
                raiz=null;
            }
            public ndarbol retornaraiz(){
                return(raiz);
            }
            public synchronized void insertarNodo(Integer nodos){
                if(raiz==null){
                    raiz=new ndarbol(d);
                    
                }
                else{
                    raiz.insertar(d);
                }
            }
            public synchronized String preorden(){
                String pre=ayudantepreorden(raiz);
                return(pre);
            }
            private String ayudantepreorden(ndarbol nodo){
                String cdna=new String();
                if(nodo!=null){

                    cdna=cdna+String.valueOf(nodo.dato+" ");
                    cdna=cdna+ayudantepreorden(nodo.li);
                    cdna=cdna+ayudantepreorden(nodo.ld);
                }
                else{
                    cdea="";
                }
                return(cdna);
            }
            public synchronized String inorden(){
                String inor=ayudanteinorden(raiz);
                return(inor);
            }
            private String ayudanteinorden(ndarbol nodo){
                String cadena=new String();
                if(nodo!=null){

                    cadena=cadena+ayudanteinorden(nodo.li);
                    cadena=cadena+nodo.dato+" ";
                    cadena=cadena+ayudanteinorden(nodo.ld);
                }
                else{cadena="";}
                return(cadena);
            }
            public synchronized String posorden(){
                String pos=ayudanteposorden(raiz);
                return(pos);
            }
            private String ayudanteposorden(ndarbol nodo){
                String cadena=new String();
                if(nodo!=null){
                    cadena=cadena+ayudanteposorden(nodo.a);
                    cadena=cadena+ayudanteposorden(nodo.f);
                    cadena=cadena+nodo.dato+" ";
                }
                else{cadena="";}
                return(cadena);
            }
            public synchronized int altura(ndarbol R){
                ndarbol p=R;
                int altizq=p.a==null ? 1:1+altura(p.li);
                int altder=p.f==null ? 1:1+altura(p.ld);
                return(Math.max(altizq,altder));
            }
            
            public synchronized int hojas(NodoArbol R){
                ndarbol p=R;
                int hojas=0;
                if(p.a==null & p.f==null){
                    hojas=1;
                }
                else{
                    if(p.a!=null){
                        hojas=hojas+hojas(p.a);
                    }
                    if(p.ld!=null){
                        hojas=hojas+hojas(p.f);
                    }
                }
                return(hojas);
            }
           
            public synchronized String ancestros(ndarbol R,int d){
                ndarbol p=R;
                String h=new String();
                if (p.dato==d){
                    return(String.valueOf(" --> "+d));
                }
                if (d>p.dato){
                    h=h+" --> "+p.dato+ancestros(p.ld,d);
                }
                else{
                    h=h+" --> "+p.dato+ancestros(p.li,d);
                }
                return(h);
            }
        }

        
        arbol arbol=new arbol();
        int valor=0;
        nodos= new Integer(10);
        for (int i=1;i<=nodos;i++){
            dato= new Intenger(i);
            arbol.insertarNodo(nodo);
        }
        
        System.out.println("preorden : "+arbol.preorden());
        
        System.out.println("inorden : "+arbol.inorden());
        
        System.out.println("postorden : "+arbol.posorden());
    }

    private void insertar(int i) {
    }

    private static class Intenger {
        public Intenger(int i) {
        }
    }
}