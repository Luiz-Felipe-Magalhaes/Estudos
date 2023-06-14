CREATE TABLE [TBXP001_CNFG_PARM_CAMP_CRSL]
([COD_CNFG_PARM_CAMP_CRSL] INT NOT NULL PRIMARY KEY,
[NOM_CNFG_PARM_CAMP_CRSL] VARCHAR(50) NOT NULL,
[IND_RGTO_ATIV] CHAR(1),
[DAT_INIO_VIGE_CAMP_CRSL] DATE,
[NUM_FUNL_COLA_COGL_INCU] VARCHAR(9) NOT NULL,
[DAT_HOR_INCU_RGTO] DATETIME NOT NULL,
[NUM_FUNL_COLA_COGL_MANT] VARCHAR(9),
[DAT_HOR_MANT_RGTO] DATETIME)

CREATE TABLE [TBXP002_HIST_CNFG_PARM_CAMP]
([COD_CNFG_PARM_CAMP_CRSL] INT NOT NULL FOREIGN KEY REFERENCES XP100.dbo.TBXP001_CNFG_PARM_CAMP_CRSL([COD_CNFG_PARM_CAMP_CRSL]),
[DAT_HOR_MANT_RGTO] DATETIME NOT NULL PRIMARY KEY,
[NOM_CNFG_PARM_CAMP_CRSL] VARCHAR(50) NOT NULL,
[IND_RGTO_ATIV] CHAR(1),
[DAT_INIO_VIGE_CAMP_CRSL] DATE,
[NUM_FUNL_COLA_COGL_INCU] VARCHAR(9) NOT NULL,
[DAT_HOR_INCU_RGTO] DATETIME NOT NULL,
[NUM_FUNL_COLA_COGL_MANT] VARCHAR(9))

CREATE TABLE [TBXP003_PARM_CAMP_CRSL]
([COD_PARM_CAMP_CRSL] INT NOT NULL PRIMARY KEY,
[NOM_PARM_CAMP_CRSL] VARCHAR(50) NOT NULL,
[IND_RGTO_ATIV] CHAR(1) NOT NULL,
[NUM_FUNL_COLA_COGL_INCU] VARCHAR(9) NOT NULL,
[DAT_HOR_INCU_RGTO] DATETIME NOT NULL,
[NUM_FUNL_COLA_COGL_MANT] VARCHAR(9),
[DAT_HOR_MANT_RGTO] DATETIME)

CREATE TABLE [TBXP004_HIST_PARM_CAMP]
([COD_PARM_CAMP_CRSL] INT NOT NULL FOREIGN KEY REFERENCES XP100.dbo.TBXP003_PARM_CAMP_CRSL([COD_PARM_CAMP_CRSL]),
[DAT_HOR_MANT_RGTO] DATETIME NOT NULL PRIMARY KEY,
[NOM_PARM_CAMP_CRSL] VARCHAR(50) NOT NULL,
[IND_RGTO_ATIV] CHAR(1),
[NUM_FUNL_COLA_COGL_INCU] VARCHAR(9) NOT NULL,
[DAT_HOR_INCU_RGTO] DATETIME NOT NULL,
[NUM_FUNL_COLA_COGL_MANT] VARCHAR(9))