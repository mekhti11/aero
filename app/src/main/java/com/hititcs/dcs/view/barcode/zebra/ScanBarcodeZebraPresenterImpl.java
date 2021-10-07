package com.hititcs.dcs.view.barcode.zebra;

import com.hititcs.dcs.di.scope.ScanBarcodeScope;
import com.hititcs.dcs.domain.interactor.boarding.ScanBarcodeUseCase;
import com.hititcs.dcs.domain.model.BoardWithBarcodeRequest;
import com.hititcs.dcs.domain.model.BoardingResponse;
import com.hititcs.dcs.subscriber.SingleSubscriber;
import com.hititcs.dcs.util.MessageUtils;
import javax.inject.Inject;

@ScanBarcodeScope
public class ScanBarcodeZebraPresenterImpl implements ScanBarcodeZebraPresenter {

  private final ScanBarcodeUseCase scanBarcodeUseCase;
  private ScanBarcodeZebraView scanBarcodeZebraView;

  @Inject
  public ScanBarcodeZebraPresenterImpl(ScanBarcodeZebraView scanBarcodeZebraView,
      ScanBarcodeUseCase scanBarcodeUseCase) {
    this.scanBarcodeZebraView = scanBarcodeZebraView;
    this.scanBarcodeUseCase = scanBarcodeUseCase;
  }

  @Override
  public ScanBarcodeZebraView getView() {
    return scanBarcodeZebraView;
  }

  @Override
  public void setView(ScanBarcodeZebraView view) {
    this.scanBarcodeZebraView = view;
  }

  @Override
  public void dispose() {
    if (scanBarcodeUseCase != null) {
      scanBarcodeUseCase.dispose();
    }
  }

  @Override
  public void scanBarcode(BoardWithBarcodeRequest request,
      ScanBarcodeZebraFragment.ResponseListener<BoardingResponse> responseListener) {
    scanBarcodeUseCase.execute(new SingleSubscriber<BoardingResponse>(this) {
      @Override
      public void onResponse(BoardingResponse data) {
        responseListener.onResponse(data);
      }

      @Override
      public void onError(Throwable e) {
        responseListener.onError(MessageUtils.getMessage(super.getErrorMessage(e)));
      }
    }, request);
  }
}