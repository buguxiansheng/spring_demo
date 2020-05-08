CREATE TABLE product_details(  
  product_name varchar(40) PRIMARY key,
  screen_size varchar(40) not null,
  display_card_type varchar(40) not null,
  product_position varchar(40) not null,
  core_architecture varchar(40) not null,
  processor_series varchar(40) not null,
  display_screen_specific varchar(40) not null,
  ram varchar(40) not null,
  hard_disk_capacity varchar(40) not null,
  dispaly_card_chip varchar(40) not null,
  weight varchar(40) not null,
  os varchar(40) not null,
  resolution varchar(40) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO product_details(product_name,screen_size,display_card_type,product_position,core_architecture,processor_series,display_screen_specific,ram,hard_disk_capacity,dispaly_card_chip,weight,os,resolution) VALUES('扬天 威6-14','14英寸','独立显卡','轻薄便携本,商用办公本',' 无','第十代酷睿i5','无','8GB','512GB SSD','AMD Radeon 625',' 无','Windows 10 Home Basic','1920×1080')