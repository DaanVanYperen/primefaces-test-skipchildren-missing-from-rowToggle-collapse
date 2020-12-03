package org.primefaces.test;

import org.primefaces.event.ToggleEvent;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ViewScoped
public class TestView implements Serializable {

    private List<String> rows;

    @PostConstruct
    public void init() {
        rows = Arrays.asList("Apple");
    }

    public List<String> getRows() {
        return rows;
    }

    public void onRowToggle(ToggleEvent event) {
        System.out.println("Row toggled");
    }

    public String getInput() {
        return "";
    }
    public void setInput(String value) {
        System.out.println("skipChildren ignored!");
    }
}
