package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public interface InputHandler {

    List<String> getCarInput();

    Integer getIterationInput();
}