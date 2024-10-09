package org.example.Analisis;

public class ContextAnalysis {

    Analysis analisis;
    public void setAnalisis(Analysis _analisisType){
        this.analisis = _analisisType;
    }

    public void Execute(){
        if(analisis!= null){
            analisis.AnalysisReport();
        } else
        {
            System.out.println("Analisis doesnt have a type");
        }
    }
}
