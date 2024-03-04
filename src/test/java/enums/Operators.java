package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Operators {
    SPLIT("S"),
    COMBINE("C");

    private final String operator;
}
