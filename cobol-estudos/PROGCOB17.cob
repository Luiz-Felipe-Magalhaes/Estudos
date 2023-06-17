       IDENTIFICATION DIVISION.
       PROGRAM-ID. PROGCOB17.
      *********************************
      * AREA DE COMENTARIOS - REMARKS
      * AUTHOR = FELIPE
      * OBJETIVO: RECEBER DADOS DE FUNCIONARIO E CALCULAR AUMENTO
      * DATA   = 13/05/2021
      *********************************
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SPECIAL-NAMES.
           DECIMAL-POINT IS COMMA.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       77  WRK-NOME                 PIC X(20)    VALUE SPACES.
       77  WRK-ANOENTRADA           PIC 9(04)    VALUE ZEROS.
       77  WRK-TEMPOTRABALHO        PIC 9(02)    VALUE ZEROS.
       77  WRK-SALARIO              PIC 9(04)V99 VALUE ZEROS.
       77  WRK-AUMENTO              PIC 9(04)V99 VALUE ZEROS.
       01  WRK-DATASISTEMA.
           02 WRK-DATAANO PIC 9(04).
           02 WRK-DATAMES PIC 9(02).
           02 WRK-DATADIA PIC 9(02).
       PROCEDURE DIVISION.
       0001-PRINCIPAL.
           PERFORM 0100-INICIALIZAR.
           PERFORM 0200-PROCESSAR.
           PERFORM 0300-FINALIZAR.
           STOP RUN.

       0100-INICIALIZAR.
           ACCEPT WRK-DATASISTEMA FROM DATE YYYYMMDD.

           DISPLAY 'NOME..'
           ACCEPT WRK-NOME.

           DISPLAY 'ANO DE ENTRADA NA EMPRESA..'
           ACCEPT WRK-ANOENTRADA.

           DISPLAY 'SALARIO ATUAL..'
           ACCEPT WRK-SALARIO.

       0200-PROCESSAR.
           IF WRK-ANOENTRADA <= WRK-DATAANO
               COMPUTE WRK-TEMPOTRABALHO = WRK-DATAANO - WRK-ANOENTRADA
               DISPLAY 'TEMPO DE CASA..' WRK-TEMPOTRABALHO ' ANOS'

               EVALUATE WRK-TEMPOTRABALHO
                   WHEN 0 THRU 1
                       COMPUTE WRK-AUMENTO = 0
                   WHEN 2 THRU 5
                       COMPUTE WRK-AUMENTO = WRK-SALARIO * 0,05
                   WHEN 6 THRU 15
                       COMPUTE WRK-AUMENTO = WRK-SALARIO * 0,10
                   WHEN OTHER
                       COMPUTE WRK-AUMENTO = WRK-SALARIO * 0,15
               END-EVALUATE

               DISPLAY 'AUMENTO..' WRK-AUMENTO
               COMPUTE WRK-SALARIO = WRK-SALARIO + WRK-AUMENTO
               DISPLAY 'NOVO SALARIO..' WRK-SALARIO
           ELSE
               DISPLAY 'DIGITE DATAS VALIDAS'
           END-IF.

       0300-FINALIZAR.
           DISPLAY '----------------'.
           DISPLAY 'FINAL DE PROCESSAMENTO'.