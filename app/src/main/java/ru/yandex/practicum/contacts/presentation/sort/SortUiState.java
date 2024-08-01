package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
public class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setNewSelectedSortType(String newSelectedSortType) {
        this.newSelectedSortType = newSelectedSortType;
    }

    public void setApplyEnable(boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public boolean getIsApplyEnable() {
        return isApplyEnable;
    }

// реализуйте get и set методы для обоих полей

}
