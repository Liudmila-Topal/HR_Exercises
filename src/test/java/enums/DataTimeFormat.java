package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DataTimeFormat {
    AM_PM_FORMAT("hh:mm:ssaa"),
    MILITARY_FORMAT("HH:mm:ss");

    private final String format;
}
