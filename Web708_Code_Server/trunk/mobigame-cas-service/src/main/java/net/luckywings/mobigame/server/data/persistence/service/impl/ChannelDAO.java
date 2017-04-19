/*******************************************************************************
 * LUCKYWINGS PROPRIETARY INFORMATION
 *  
 * The information contained herein is proprietary to LuckyWings and shall not be reproduced or
 * disclosed in whole or in part or used for any design or manufacture without direct written
 * authorization from LuckyWings.
 *
 * Copyright (c) 2016 by LuckyWings. All rights reserved.
 *******************************************************************************/
package net.luckywings.mobigame.server.data.persistence.service.impl;

import net.luckywings.mobigame.server.data.model.Channel;
import net.luckywings.mobigame.server.data.persistence.service.IChannelDAO;
import net.luckywings.mobigame.server.persistence.service.impl.AbstractSimpleStaticDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("channelDAO")
public class ChannelDAO extends AbstractSimpleStaticDAO<Channel> implements IChannelDAO {

    private final Logger logger = LoggerFactory.getLogger(ChannelDAO.class);

}
