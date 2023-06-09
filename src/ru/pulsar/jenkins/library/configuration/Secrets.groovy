package ru.pulsar.jenkins.library.configuration

import com.cloudbees.groovy.cps.NonCPS
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonPropertyDescription

@JsonIgnoreProperties(ignoreUnknown = true)
class Secrets implements Serializable {

    public static final String UNKNOWN_ID = "UNKNOWN_ID"

    @JsonPropertyDescription("Путь к хранилищу конфигурации")
    String storagePath

    @JsonPropertyDescription("Данные авторизации в хранилище конфигурации")
    String storage

    @JsonPropertyDescription("Идентификатор telegram-чата для отправки уведомлений")
    String telegramChatId

    @JsonPropertyDescription("Токен авторизации telegram-бота для отправки уведомлений")
    String telegramBotToken

    @Override
    @NonCPS
    String toString() {
        return "Secrets{" +
            "storagePath='" + storagePath + '\'' +
            ", storage='" + storage + '\'' +
            ", telegramChatId='" + telegramChatId + '\'' +
            ", telegramBotToken='" + telegramBotToken + '\'' +
            '}';
    }
}
