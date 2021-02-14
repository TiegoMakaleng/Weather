package com.tiegomakaleng.weatherapp.utils.formatters;

import androidx.annotation.NonNull;

import com.tiegomakaleng.weatherapp.models.ImmutableWeather;

/**
 * Formatter for weather description.
 */
public abstract class DescriptionFormatter {
    /**
     * Returns weather description with first uppercase letter.
     * @param weather weather info
     * @return weather description with first uppercase letter
     * @throws NullPointerException if {@code weather} is null
     */
    @NonNull
    public static String getDescription(@NonNull ImmutableWeather weather)
            throws NullPointerException {
        //noinspection ConstantConditions
        if (weather == null)
            throw new NullPointerException("weather should not be null");

        String description = weather.getDescription();
        String result;
        if (description.isEmpty())
            result = description;
        else
            result = description.substring(0,1).toUpperCase() + description.substring(1);
        return result;
    }
}
