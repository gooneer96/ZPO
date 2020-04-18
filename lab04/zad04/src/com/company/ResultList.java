package com.company;

import java.util.List;

public class ResultList extends MaxSearchAlgorithms{
    private String method;
    private List<Integer> result;

    ResultList(String method, List<Integer> result){
        this.method=method;
        this.result=result;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Name of used method: ").append(method).append(", result of method: {").append(result.get(0));
        for( int i=1;i<result.size();i++)
        {
            output.append(", ").append(result.get(i));
        }
        output.append("}");
        return output.toString();
    }

}
