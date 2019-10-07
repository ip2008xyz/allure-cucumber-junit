package com.tmy.cucumber.allure;

import io.cucumber.java.sl.In;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Storage {

    List<Integer> data = new ArrayList<>();
    Integer result = 0;

    @Step("store {0}")
    public void store(Integer... a) {
        data = Arrays.asList(a);
    }

    @Step("do sum")
    public void sum() {
        doSubStepWithResult(data);
        doSubStepNoAttachment("input param", 12, Instant.now());
        result = data.stream().mapToInt(value -> value).sum();
    }

    @Step("do multiplication")
    public void multiply() {
        result = 1;
        for (Integer value : data) {
            result *= value;
        }
    }

    @Step("get result")
    @Attachment
    public Integer getResult() {
        return result;
    }

    @Step("execute sub step with {0} and return")
    @Attachment
    public String doSubStepWithResult(List<Integer> data) {
        return "posible response";
    }

    @Step("execute sub step with parameters {0}, {1}, {2}")
    public String doSubStepNoAttachment(String param, Integer number, Instant date) {
        return "nothing";
    }

}
